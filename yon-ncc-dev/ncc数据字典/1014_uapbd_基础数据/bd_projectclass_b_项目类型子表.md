# |<<

**项目类型子表 (bd_projectclass_b / nc.vo.pmpub.projecttype.ProjectTypeBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/938.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_projectclass_b | 项目类型子表主键 | pk_projectclass_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 4 | pk_userdefitem | 用户定义属性键值 | pk_userdefitem | varchar(20) |  | 主键 (UFID) |
| 5 | preindex | 自定义项编号 | preindex | int |  | 整数 (Integer) |