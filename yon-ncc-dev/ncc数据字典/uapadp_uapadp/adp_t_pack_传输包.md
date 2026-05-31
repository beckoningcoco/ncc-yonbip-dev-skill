# |<<

**传输包 (adp_t_pack / nc.vo.uap.distribution.datatrans.TransPackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/29.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | packid | 传输包ID | packid | char(20) | √ | 主键 (UFID) |
| 2 | packuuid | 传输包的全局唯一ID | packuuid | varchar(50) |  | 字符串 (String) |
| 3 | packtype | 传输包类型 | packtype | int |  | 传输包类型 (TransPackType) |  | 0=数据包; |