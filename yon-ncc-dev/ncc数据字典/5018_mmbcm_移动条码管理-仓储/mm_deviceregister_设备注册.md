# |<<

**设备注册 (mm_deviceregister / nc.vo.mmbcm.pub.entity.DeviceRegisterVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3655.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | 主键 | id | char(20) | √ | 主键 (UFID) |
| 2 | devicecode | 设备编码 | devicecode | varchar(50) | √ | 字符串 (String) |
| 3 | deviceuniqueid | 机器唯一标识 | deviceuniqueid | varchar(50) | √ | 字符串 (String) |
| 4 | registrant | 注册者 | registrant | varchar(20) |  | 用户 (user) |
| 5 | registertime | 注册时间 | registertime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | apptype | app应用 | apptype | varchar(50) | √ | App应用类型 (AppTypeEnum) |  | MM=生产; |