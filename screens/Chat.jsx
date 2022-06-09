import { StyleSheet, Text, View, TouchableOpacity } from 'react-native';
import { useQuery } from 'react-query'

export default function Chat() {
  const { isLoading, error, data } = useQuery('users', () =>
    fetch('https://jsonplaceholder.typicode.com/users').then(res =>
       res.json()
    )
  )
  if (isLoading) return <Text>Loading...</Text>
  if (error) return <Text>Error</Text>

  console.log(data)

  return (
    <View style={styles.container}>
      <Text>Chat</Text>
      <Text>Fetching api from jsonplaceholder.typicode.com/users</Text>
      { 
        data.map((user, index) =>(
        <Text key={index}>
          Index: {index}, Name: {user.name}
        </Text>
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
