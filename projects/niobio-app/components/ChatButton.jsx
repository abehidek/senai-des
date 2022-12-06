import { StyleSheet, Text, View, TouchableOpacity } from 'react-native';

export default function ChatButton({ user, navigation }) {
  return (
    <View>
      <TouchableOpacity style={styles.button} onPress={() => navigation.navigate('Marcar Partida')}>
        <Text>{ user.username }</Text>
      </TouchableOpacity>
    </View>
  );
}

const styles = StyleSheet.create({
  button: {
    padding: '1rem',
    backgroundColor: 'white',
    borderBottomWidth: '2px',
    borderColor: 'grey',
  },
})