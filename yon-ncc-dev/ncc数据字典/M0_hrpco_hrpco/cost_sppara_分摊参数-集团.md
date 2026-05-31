# |<<

**分摊参数-集团 (cost_sppara / nc.vo.co.bd.bd0024.CostspparaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1629.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sppara | 主键 | pk_sppara | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | name | 分摊参数名称 | name | varchar(50) | √ | 字符串 (String) |
| 6 | code | 分摊参数编码 | code | varchar(50) | √ | 字符串 (String) |
| 7 | vformula | 公式 | vformula | varchar(200) |  | 字符串 (String) |
| 8 | pk_templet | 对应模板 | pk_templet | int | √ | 对应模板 (SpParaenu) |  | 1=基本模板; |