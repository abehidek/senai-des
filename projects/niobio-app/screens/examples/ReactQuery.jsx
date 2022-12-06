import { StyleSheet, Text, View, TouchableOpacity } from 'react-native';
import { useQuery } from 'react-query'

export default function ReactQuery() {
  const { isLoading, error, data } = useQuery('placeholder', () =>
    fetch('https://jsonplaceholder.typicode.com/users').then(res =>
       res.json()
    )
  )
  if (isLoading) return <Text>Loading...</Text>
  if (error) return <Text>Error</Text>

  console.log(data)

  return (
    <View style={styles.container}>
      <Text>Home.jsx file</Text>
      { data.map((user, index) =>(
        <Text key={index}>
          Index: {index}, Name: {user.name}
        </Text>
      ))
      }
      <TouchableOpacity style={styles.button}>
        <Text>Outra tela</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    padding: '2rem',
    backgroundColor: 'red',
  },
  button: {
    padding: '1rem',
    backgroundColor: 'blue',
    borderRadius: '0.5rem',
  },
});
