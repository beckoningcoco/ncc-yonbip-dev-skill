# |<<

**令牌资源控制子表配置 (bd_disttokenctrl_b / nc.vo.bd.distribute.BDDistTokenCtrlBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/805.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disttokenctrl_b | 子表主键 | pk_disttokenctrl_b | char(20) | √ | 主键 (UFID) |
| 2 | receiptcode | 令牌接收方 | receiptcode | varchar(100) |  | 字符串 (String) |
| 3 | receipttime | 令牌接收时间 | receipttime | char(19) |  | 日期时间 (UFDateTime) |
| 4 | releasetime | 令牌释放时间 | releasetime | char(19) |  | 日期时间 (UFDateTime) |
| 5 | datastatus | 令牌资源数据状态 | datastatus | int |  | 令牌资源数据状态 (BDDistNodeDataStatus) | 0 | 0=未上传资源; |