# |<<

**报检单 (qc_applybill / nc.vo.qc.c001.entity.ApplyHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4821.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_applybill | 报检单 | pk_applybill | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | fsourcetype | 来源类型 | fsourcetype | int |  | 报检点单据类型 (enum) |  | 1=采购到货报检; |