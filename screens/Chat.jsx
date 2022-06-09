import { StyleSheet, Text, View, TouchableOpacity } from 'react-native';
import { useQuery } from 'react-query'

import ChatButton from '../components/ChatButton';

export default function Chat({ navigation }) {
  const { isLoading, error, data } = useQuery('users', () =>
    fetch('https://jsonplaceholder.typicode.com/users').then(res =>
       res.json()
    )
  )
  if (isLoading) return <Text>Loading...</Text>
  if (error) return <Text>Error</Text>

  return (
    <View style={styles.container}>
      <Text>Fetching api from jsonplaceholder.typicode.com/users</Text>
      { 
        data.map((user, index) =>(
          <ChatButton key={index} user={user} navigation={navigation} />
        )) 
      }
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    padding: '0.5rem',
  },
  button: {
    padding: '1rem',
    backgroundColor: 'white',
    borderBottomWidth: '2px',
    borderColor: 'grey',
  },
});
