import AsyncStorage from '@react-native-async-storage/async-storage';
import { StyleSheet, Text, View, TouchableOpacity } from 'react-native';

export default function Settings({ navigation }) {
  const logout = async () => {
    try {
      await AsyncStorage.clear()
      navigation.replace('Login')
    } catch (e) {
      console.error(e)
    }
  }
  return (
    <View style={styles.container}>
      <TouchableOpacity style={styles.button} onPress={logout}>
        <Text>Logout</Text>
      </TouchableOpacity>
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
