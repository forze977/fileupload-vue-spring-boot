<template>
  <div>
    <div>
      <input type="file" id="file" ref="file" v-on:change="handleFileUpload()"/>
    </div>
    <div>
      <button v-on:click="submitFile()">upload</button>
    </div>
  </div>
</template>

<script>
import axios from 'axios'  
export default {
  name: 'HelloWorld',
  data(){
    return{
      file: ''
    }
  },
  methods: {
    handleFileUpload(){
      this.file = this.$refs.file.files[0];
    },
    submitFile(){
      let formData = new FormData();
      formData.append('file', this.file);
      axios.post(
        'http://localhost:8080/upload',
        formData,
        {
          headers: {
            'Content-Type': 'multipart/form-data'
          }
        }
      ).then(() => {alert('upload complete')});
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
