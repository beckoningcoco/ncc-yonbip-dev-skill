# |<<

**令牌资源控制表 (bd_disttokenctrl / nc.vo.bd.distribute.BDDistTokenCtrlVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/804.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disttokenctrl | 主键 | pk_disttokenctrl | char(20) | √ | 主键 (UFID) |
| 2 | tokencode | 令牌配置表编码 | tokencode | varchar(50) | √ | 字符串 (String) |
| 3 | tokennum | 令牌号 | tokennum | varchar(40) |  | 字符串 (String) |
| 4 | createsyscode | 创建节点编码 | createsyscode | varchar(100) |  | 字符串 (String) |
| 5 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | callbacktime | 全部回收完毕时间 | callbacktime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | releasetime | 完部下发成功时间 | releasetime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | tokenparam | 令牌参数 | tokenparam | image |  | BLOB (BLOB) |
| 9 | busiparam | 业务参数 | busiparam | varchar(500) |  | 字符串 (String) |
| 10 | reclaimer | 回收人 | reclaimer | varchar(20) |  | 用户 (user) |
| 11 | releaser | 下发人 | releaser | varchar(20) |  | 用户 (user) |
| 12 | releatime | 下发时间 | releatime | char(19) |  | 日期时间 (UFDateTime) |