# |<<

**会计辅助核算项目 (bd_accassitem / nc.vo.bd.accassitem.AccAssItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/298.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accassitem | 主键 | pk_accassitem | char(20) | √ | 主键 (UFID) |
| 2 | code | 辅助核算项编码 | code | varchar(40) | √ | 字符串 (String) |
| 3 | name | 辅助核算项名称 | name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | classid | 数据对象 | classid | varchar(36) | √ | 实体 (entity) |
| 5 | inputlength | 输入长度 | inputlength | smallint |  | 整数 (Integer) |  | [1 , 200] |
| 6 | digits | 精度 | digits | smallint |  | 整数 (Integer) |  | [0 , 8] |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | dataoriginflag | 数据来源 | dataoriginflag | smallint |  | 数据来源 (dataorigin) |  | 0=本级产生; |