<template>
  <div >
    <h1>{{pageName}}</h1>
   <!-- <MixChart style="width: 1000px;height: 1000px"></MixChart>-->

  </div>
</template>

<script>
import logManagerjs from '../../api/logManager'
export default {
  name: 'logManager',
  data() {
    return {
      pageName: '日志管理',
      tableQuery: {

      },
      tableData:{

      },

    }
  },
  methods: {
    initData() {
      logManagerjs.getLog({id:1}).then(res =>{

      })
    }
  },
  created() {
    this.initData()
  }
}
</script>

