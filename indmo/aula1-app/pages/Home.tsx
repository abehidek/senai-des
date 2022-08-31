import { StatusBar } from 'expo-status-bar';
import { useState } from 'react';
import { StyleSheet, Text, View, Switch, Image, TextInput, TouchableOpacity } from 'react-native';

export default function Home() {
  const [isEnabled, setIsEnabled] = useState(false);
  const [text, setText] = useState('');
  const toggleSwitch = () => setIsEnabled(previousState => !previousState);

  return (
    <View className="flex-1 items-center justify-center gap-5">
      { isEnabled ? <Image 
          source={{ uri: 'https://avatars.githubusercontent.com/u/104985961?s=200&v=4.png' }} 
          style={{ width: 200, height: 200 }} 
        /> : <View style={{ width: 200, height: 200 }}></View> }
      <StatusBar style="auto" />
      <Text className="font-bold text-3xl">Monkey Developers</Text>
      <Text className="text-2xl">{text}</Text>
      <Switch
        trackColor={{ false: "#767577", true: "#81b0ff" }}
        thumbColor={isEnabled ? "#f5dd4b" : "#f4f3f4"}
        ios_backgroundColor="#3e3e3e"
        className='scale-x-150 scale-y-150'

        onValueChange={toggleSwitch}
        value={isEnabled}
      />
      <TextInput
        className='border-2 p-3 w-56 rounded-md'
        placeholder="You can type in me"
        value={text}
        onChangeText={setText}
      />
      <TouchableOpacity
        className='bg-blue-500 px-5 py-3 rounded'
        onPress={() => alert(`Você digitou: ${text}`)}
      >
        <Text className='text-white font-bold'>Toque aqui!</Text>
      </TouchableOpacity>
    </View>
  );
}