# |<<

**编码规则 (hr_coderule / nc.vo.hr.certificatefile.CodeRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2658.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_coderule | 编码规则主键 | pk_coderule | char(20) | √ | 主键 (UFID) |
| 2 | pk_ctffile | 证书档案主键 | pk_ctffile | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | elementtype | 元素类型 | elementtype | int |  | 编码规则类型 (coderuletype) |  | 0=人员基本信息; |