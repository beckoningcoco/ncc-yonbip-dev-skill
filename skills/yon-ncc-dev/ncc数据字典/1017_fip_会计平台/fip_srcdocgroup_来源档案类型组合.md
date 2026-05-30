# |<<

**来源档案类型组合 (fip_srcdocgroup / nc.vo.fip.docview.SrcDocGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2250.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srcdocgroup | 对象标识 | pk_srcdocgroup | char(20) | √ | 主键 (UFID) |
| 2 | docindex | 序号 | docindex | int |  | 整数 (Integer) |
| 3 | pk_srcdocid | 来源档案类型 | pk_srcdocid | varchar(36) |  | 实体 (entity) |
| 4 | srcref | 对应参照 | srcref | varchar(101) |  | 字符串 (String) |