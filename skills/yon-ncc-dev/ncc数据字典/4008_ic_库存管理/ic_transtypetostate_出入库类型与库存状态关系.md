# |<<

**出入库类型与库存状态关系 (ic_transtypetostate / nc.vo.ic.transtypetostate.TransTypeToStateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3003.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtypetostate | 出入库类型与库存状态关系 | pk_transtypetostate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_billtype | 出入库交易类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 4 | binoutflag | 收发标识 | binoutflag | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | pk_storestate | 库存状态编码 | pk_storestate | varchar(20) |  | 库存状态 (ic_storestate) |