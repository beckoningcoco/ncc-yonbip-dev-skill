# |<<

**职务工作职责 (om_jobcontent / nc.vo.om.job.JobContentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3934.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_job_sub | 职务工作职责PK | pk_job_sub | char(20) | √ | 主键 (UFID) |
| 2 | jobworktype | 工作类型 | jobworktype | char(50) |  | 字符串 (String) |
| 3 | jobcontentdesc | 描述 | jobcontentdesc | varchar(256) |  | 字符串 (String) |
| 4 | jobcontenttype | 职责类型 | jobcontenttype | varchar(20) | √ | 职责类型(自定义档案) (Defdoc-HRJF001_0xx) |
| 5 | pk_job | 职务主键 | pk_job | varchar(20) |  | 职务 (om_job) |
| 6 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 7 | lastflag | 是否最近记录 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |