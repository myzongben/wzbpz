/**
 * 日志记录配置类
 * 王宗本
 * 2020/10/25
 */
import request from '@/utils/request'

export default {
  getLog(queryParam, pageParam) {
    return request({
      url: '/log/getLog',
      method: 'post',
      data: {
        ...queryParam,
        current: 1,
        size: 20
      }

    })
  } ,

}
