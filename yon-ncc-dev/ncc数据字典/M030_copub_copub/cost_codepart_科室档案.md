# |<<

**科室档案 (cost_codepart / nc.vo.hrpco.codepart.CodepartVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1604.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_codepart | 主键 | pk_codepart | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 科室编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 科室名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | vhelpcode | 助记码 | vhelpcode | varchar(50) |  | 字符串 (String) |
| 8 | pk_deptpf | 对应平台科室 | pk_deptpf | varchar(20) |  | 组织_部门 (dept) |
| 9 | idepttype | 科室类型 | idepttype | int |  | 科室 (Deptenum) |  | 1=普通科室; |