# |<<

**勿扰模式 (sm_disturb / nc.vo.platform.workbench.DisturbVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5298.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_disturb | 勿扰模式主键 | pk_disturb | char(20) | √ | 主键 (UFID) |
| 2 | isopen | 是否开启勿扰模式 | isopen | char(1) | √ | 布尔类型 (UFBoolean) |
| 3 | isdark | 是否同时开启暗色模式 | isdark | char(1) | √ | 布尔类型 (UFBoolean) |
| 4 | entrytime | 生效时间 | entrytime | varchar(50) | √ | 字符串 (String) |
| 5 | duetime | 到期时间 | duetime | char(19) | √ | 日期时间 (UFDateTime) |
| 6 | userid | 用户主键 | userid | varchar(50) | √ | 字符串 (String) |