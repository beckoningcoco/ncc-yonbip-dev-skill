# |<<

**作业人员个人配置 (ssctp_usersetting / nc.vo.ssctp.sscbd.SSCUserSettingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5669.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usersetting | 唯一标识 | pk_usersetting | varchar(50) | √ | 字符串 (String) |
| 2 | pk_sscuser | 作业人员 | pk_sscuser | varchar(20) |  | 用户 (user) |
| 3 | openimage | 自动打开影像 | openimage | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | openbill | 自动打开单据 | openbill | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | usertype | 用户类型 | usertype | varchar(50) |  | 共享用户类型 (sscusertype) |  | chargeman=组长; |