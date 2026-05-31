# |<<

**安全工作包子表 (pam_safety_job_b / nc.vo.aim.safetyjob.SafetyJobBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4322.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_safe_job_b | 安全工作包表体主键 | pk_safe_job_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 维修组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 字符串 (String) |
| 5 | pk_precaution | 危险编码 | pk_precaution | varchar(20) |  | 危险与安全措施 (PrecautionVO) |
| 6 | precaution_name | 危险名称 | precaution_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 7 | risk_type | 危险类型 | risk_type | varchar(30) |  | 字符串 (String) |
| 8 | preventive | 预防措施 | preventive | varchar(1024) |  | 字符串 (String) |
| 9 | isolate_flag | 需要隔离 | isolate_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | pk_isolate_temp | 隔离模板 | pk_isolate_temp | varchar(20) |  | 隔离模板 (IsoTempHeadVO) |
| 11 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 12 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |