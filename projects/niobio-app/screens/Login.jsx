import React from "react";
import { Image, StyleSheet, Text, View, TouchableOpacity, TextInput } from 'react-native';
import logo from '../assets/favicon.png';
import { useQuery } from 'react-query'
import AsyncStorage from '@react-native-async-storage/async-storage';

export default function Login({ navigation }) {
  const checkUser = async () => {
    try {
      const value = await AsyncStorage.getItem('@authUser')
      if (value) { navigation.replace('Index') }
    } catch (e) {
      console.error(e)
    }
  }
  const authUser =  async () => {
    const data = await fetch('https://jsonplaceholder.typicode.com/users/1').then(res =>
      res.json()
    )
    console.log(data)
    if (data.username === email) {
      try {
        await AsyncStorage.setItem('@authUser', email)
      } catch (e) { console.log(e); }
      navigation.replace('Index')
    }
    else { alert("Email ou senha incorretos") }
  }

  React.useEffect(() => {
    checkUser();
  }, []);
  const [email, onChangeEmail] = React.useState("Bret");
  const [password, onChangePassword] = React.useState("");
  return (
    <View style={styles.container}>
      <Image source={logo} style={{ width: 50, height: 50 }}/>
      <View style={{ gap: '2rem', width: '100%'}}>
        <View style={styles.inputActions}>
          <TextInput
            style={styles.input}
            value={email}
            placeholder="Digite seu email aqui"
            onChangeText={onChangeEmail}
          />
          <TextInput
            style={styles.input}
            value={password}
            placeholder="Digite sua senha aqui"
            onChangeText={onChangePassword}
          />
        </View>

        <View style={styles.buttonActions}>
          <TouchableOpacity style={styles.button} onPress={authUser}>
            <Text>Fazer login</Text>
          </TouchableOpacity>

          <TouchableOpacity style={styles.button} onPress={() => navigation.navigate('Cadastrar')}>
            <Text>Cadastrar</Text>
          </TouchableOpacity>
        </View>
      </View>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    padding: '0.5rem',
    display: 'flex',
    justifyContent: 'space-evenly',
    alignItems: 'center',
    height: '100vh',
  },
  button: {
    padding: '1rem',
    backgroundColor: 'grey',
    borderRadius: '0.5rem',
  },
  buttonActions: {
    width: '100%',
    display: 'flex',
    gap: '0.5rem',
    justifyContent: 'space-between',
  },
  input: {
    padding: '1rem',
    width: '100%',
    borderWidth: '2px',
  },
  inputActions: {
    display: 'flex',
    gap: '1rem',
    width: '100%',
  },
});

