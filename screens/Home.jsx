import { StyleSheet, Text, View, TouchableOpacity, ScrollView } from 'react-native';
import { useQuery } from 'react-query'

import Card from '../components/Card';

export default function Home({ navigation }) {
  const { isLoading, error, data } = useQuery('placeholder', () =>
    fetch('https://jsonplaceholder.typicode.com/posts').then(res =>
       res.json()
    )
  )
  if (isLoading) return <Text>Loading...</Text>
  if (error) return <Text>Error</Text>

  console.log(data)

  return (
    <View style={styles.container}>
      <ScrollView>
        <TouchableOpacity style={styles.button} onPress={() => navigation.navigate('Marcar Partida')} >
          <Text>Marcar uma nova partida</Text>
        </TouchableOpacity>
        {
          data.map((post, index) =>(
            <Card key={index} post={post}/>
          ))
        }
      </ScrollView>
    </View>
 ); 
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: '0.5rem',
  },
  button: {
    padding: '1rem',
    backgroundColor: 'grey',
    borderRadius: '0.5rem',
  },
});

