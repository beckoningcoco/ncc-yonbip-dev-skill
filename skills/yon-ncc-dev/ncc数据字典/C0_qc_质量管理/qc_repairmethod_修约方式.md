# |<<

**修约方式 (qc_repairmethod / nc.voqc.qc_repairmethod.qc_repairmethod)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4857.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repairmethod | 修约方式主键 | pk_repairmethod | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vrepaircode | 修约方式编码 | vrepaircode | varchar(50) |  | 字符串 (String) |
| 4 | vrepairname | 修约方式名称 | vrepairname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | nrepairgap | 修约间隔 | nrepairgap | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | frepairunit | 修约单位 | frepairunit | int |  | 修约单位 (frepairunit) |
| 7 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |