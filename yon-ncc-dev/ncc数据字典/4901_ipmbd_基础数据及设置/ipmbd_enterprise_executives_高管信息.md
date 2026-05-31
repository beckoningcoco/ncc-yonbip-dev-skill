# |<<

**高管信息 (ipmbd_enterprise_executives / nc.vo.ipmbd.enterpriseperson.EnterprisePersionExecutivesVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3221.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_executives | 高管信息主键 | pk_executives | char(20) | √ | 主键 (UFID) |
| 2 | name | 姓名 | name | varchar(50) |  | 字符串 (String) |
| 3 | pk_job | 职位 | pk_job | varchar(20) |  | 人力资源管理_职务 (job) |
| 4 | vgender | 性别 | vgender | varchar(50) |  | 性别 (Gender) |  | 1=男; |