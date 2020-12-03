<template>
<div style="width: 1000px;height: 1000px">
    <h1>{{pageName}}</h1>
  <jsonEditor style="width: 1000px;height: 1000px"></jsonEditor>
  </div>
</template>

<script>
  import jsonEditor from '../../components/MDinput/index'
  export default {
    name: 'Menu2',
    components: { jsonEditor },
    data() {
      return {
        pageName: '菜单2'
      }
    }
  }
</script>

