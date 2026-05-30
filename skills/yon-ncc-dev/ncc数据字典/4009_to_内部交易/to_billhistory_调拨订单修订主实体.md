# |<<

**调拨订单修订主实体 (to_billhistory / nc.vo.to.m5x.entity.BillHistoryHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5784.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbillid | 调拨订单 | cbillid | char(20) | √ | 主键 (UFID) |
| 2 | vbillcode | 单据号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 3 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | fmodeflag | 调拨方式 | fmodeflag | int |  | 调拨方式 (TransMode) |  | 1=三方调拨; |