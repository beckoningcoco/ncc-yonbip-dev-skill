# |<<

**包含部门 (org_pfdept / nc.vo.profitcenter.Pfdept)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4119.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pfdept | 包含部门标识 | pk_pfdept | char(20) | √ | 主键 (UFID) |
| 2 | pk_dept | 包含部门 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |