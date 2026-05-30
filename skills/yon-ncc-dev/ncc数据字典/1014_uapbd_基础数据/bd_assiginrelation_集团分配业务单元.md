# |<<

**集团分配业务单元 (bd_assiginrelation / nc.vo.bd.bdactivity.entity.AssiginRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/332.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relation | 分配关系主键 | pk_relation | char(20) | √ | 主键 (UFID) |
| 2 | pk_srccactivityid | 来源集团档案的主键 | pk_srccactivityid | varchar(50) |  | 字符串 (String) |
| 3 | pk_assiginorg | 分配组织 | pk_assiginorg | varchar(50) |  | 字符串 (String) |
| 4 | pk_unitcactivityid | 分配组织档案的主键 | pk_unitcactivityid | varchar(50) |  | 字符串 (String) |
| 5 | pk_group | 集团 | pk_group | varchar(50) |  | 字符串 (String) |