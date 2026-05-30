# |<<

**职务 (om_job / nc.vo.om.job.JobVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3931.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_job | 职务主键 | pk_job | char(20) | √ | 主键 (UFID) |
| 2 | jobname | 职务名称 | jobname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 3 | jobcode | 职务编码 | jobcode | varchar(50) | √ | 字符串 (String) |
| 4 | jobdesc | 职务概要 | jobdesc | varchar(1024) |  | 备注 (Memo) |
| 5 | pk_jobtype | 职务类别 | pk_jobtype | varchar(20) | √ | 职务类别 (jobtype) |
| 6 | pk_grade_source | 职级来源old | pk_grade_source | varchar(20) |  | 职务类别 (jobtype) |
| 7 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 9 | reqedu | 最低学历要求 | reqedu | varchar(20) |  | 学历(自定义档案) (Defdoc-HR008_0xx) |
| 10 | reqsex | 性别要求 | reqsex | int |  | 性别 (sex) |  | 1=男; |