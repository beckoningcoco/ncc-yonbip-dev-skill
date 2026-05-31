# |<<

**计息对象账户信息 (fac_intaccountinfo / nc.vo.fac.interestobj.IntAccountInfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2093.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_intaccinfo | 计息账户信息主键 | pk_intaccinfo | char(20) | √ | 主键 (UFID) |
| 2 | pk_accintobj | 计息对象主键 | pk_accintobj | varchar(20) |  | 账户计息对象 (fac_accinterestobj) |
| 3 | useflag | 停用标志 | useflag | char(1) |  | 布尔类型 (UFBoolean) |
| 4 | pk_accid | 账户编码 | pk_accid | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | accountname | 账户名称 | accountname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | distroyaccdate | 销户日期 | distroyaccdate | char(19) |  | 日期 (UFDate) |
| 7 | shutter | 停用人 | shutter | varchar(20) |  | 用户 (user) |
| 8 | shuttime | 停用日期 | shuttime | char(19) |  | 日期 (UFDate) |
| 9 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 14 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 15 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 16 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 17 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 18 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |