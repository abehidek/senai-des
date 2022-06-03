import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View, TouchableOpacity } from 'react-native';

export default function App() {
  return (
    <View style={styles.container}>
      <Text>Open up App.js to start working on your app!!</Text>
      <StatusBar style="auto" />
      <TouchableOpacity style={styles.button} >Tap here</TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  // container: {
  //   flex: 1,
  //   backgroundColor: '#fff',
  //   alignItems: 'center',
  //   justifyContent: 'center',
  // },
  container: {
    padding: '0.8rem',
  },
  button: {
    padding: '1rem',
    backgroundColor: 'blue',
    borderRadius: '0.5rem',
  },
});
