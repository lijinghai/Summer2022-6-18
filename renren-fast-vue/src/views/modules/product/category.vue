<!--
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @Description:
 * @date 2022/8/4 18:13
 * @Version: v1.0
-->
<template>
  <el-tree :data="data" :props="defaultProps" @node-click="handleNodeClick"></el-tree>
</template>

<script>
// 这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
// 例如：import 《组件名称》 from '《组件路径》';
export default {
  name: 'category',
// import引入的组件需要注入到对象中才能使用
  components: {},
  // 这里存放数据
  data () {
    return {
      data: [{
        label: '一级 1',
        children: [{
          label: '二级 1-1',
          children: [{
            label: '三级 1-1-1'
          }]
        }]
      }, {
        label: '一级 2',
        children: [{
          label: '二级 2-1',
          children: [{
            label: '三级 2-1-1'
          }]
        }, {
          label: '二级 2-2',
          children: [{
            label: '三级 2-2-1'
          }]
        }]
      }, {
        label: '一级 3',
        children: [{
          label: '二级 3-1',
          children: [{
            label: '三级 3-1-1'
          }]
        }, {
          label: '二级 3-2',
          children: [{
            label: '三级 3-2-1'
          }]
        }]
      }],
      defaultProps: {
        children: 'children',
        label: 'label'
      }
    }
  },
// 监听属性 类似于data概念
  computed: {},
// 监控data中的数据变化
  watch: {},
// 方法集合
  methods: {
    handleNodeClick (data) {
      console.log(data)
    },
    // 获取数据
    getMenus () {
      this.$http({
        url: this.$http.adornUrl('/product/category/list/tree'),
        method: 'get'
      }).then(data => {
        console.log('成功获取到菜单数据', data)
      })
    }
  },
// 生命周期 - 创建完成（可以访问当前this实例）
  created () {
    this.getMenus()
  },
// 生命周期 - 挂载完成（可以访问DOM元素）
  mounted () {

  },
  // 生命周期 - 创建之前
  beforeCreate () {
  },
  // 生命周期 - 挂载之前
  beforeMount () {
  },
  // 生命周期 - 更新之前
  beforeUpdate () {
  },
  // 生命周期 - 更新之后
  updated () {
  },
  // 生命周期 - 销毁之前
  beforeDestroy () {
  },
  // 生命周期 - 销毁完成
  destroyed () {
  },
  // 如果页面有keep-alive缓存功能，这个函数会触发
  activated () {
  }
}
</script>
<style scoped>
/*引入公共css类 @import url();*/

</style>
