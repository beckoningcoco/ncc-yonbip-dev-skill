# |<<

**职务工作目标 (om_jobaim / nc.vo.om.job.JobAimVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3932.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_job_sub | 职务工作目标PK | pk_job_sub | char(20) | √ | 主键 (UFID) |
| 2 | jobaimno | 编码 | jobaimno | varchar(28) | √ | 字符串 (String) |
| 3 | jobaimdesc | 描述 | jobaimdesc | varchar(256) |  | 字符串 (String) |
| 4 | jobaimname | 目标 | jobaimname | varchar(100) |  | 字符串 (String) |
| 5 | pk_job | 职务主键 | pk_job | varchar(20) |  | 职务 (om_job) |
| 6 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 7 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |