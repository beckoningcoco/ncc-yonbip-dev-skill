# |<<

**故障现象 (pam_failure_symptom / nc.vo.am.failuresymptom.FailuresymptomVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4256.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_failure_symptom | 故障现象标识 | pk_failure_symptom | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | symptom_code | 编码 | symptom_code | varchar(40) |  | 字符串 (String) |
| 5 | symptom_name | 名称 | symptom_name | varchar(400) |  | 多语文本 (MultiLangText) |
| 6 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 7 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |