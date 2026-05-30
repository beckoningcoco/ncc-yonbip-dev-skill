# |<<

**临床路径_纳入条件 (uh_cn_cp_into / com.yonyou.yh.nhis.cn.cp.vo.CpIntoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5970.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_into | 主键 | pk_into | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | char(20) | √ | 主键 (UFID) |
| 4 | pk_cp | 对应的路径id | pk_cp | varchar(20) |  | 临床路径_基本信息表 (cncp) |
| 5 | type_into | 类别：诊断、手术 | type_into | int |  | 整数 (Integer) |
| 6 | pk_diag | 诊断/手术主键 | pk_diag | varchar(20) |  | 字符串 (String) |
| 7 | code_diag | 诊断/手术编码 | code_diag | varchar(32) |  | 字符串 (String) |
| 8 | name_diag | 诊断/手术名称 | name_diag | varchar(64) |  | 字符串 (String) |
| 9 | remarks | 备注 | remarks | varchar(500) |  | 字符串 (String) |