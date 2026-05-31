# |<<

**期初余额管理明细 (tpf_Initdatamanagedetail / nc.vo.tmpf.initdatamanage.InitdatamanagedetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5828.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_initdatamanagedetail | 期初余额管理明细主键 | pk_initdatamanagedetail | char(20) | √ | 主键 (UFID) |
| 2 | accountno | 账号 | accountno | varchar(1024) |  | 字符串 (String) |
| 3 | accountname | 账号名称 | accountname | varchar(1024) |  | 字符串 (String) |
| 4 | initbalance | 期初余额 | initbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 5 | remark | 备注 | remark | varchar(1024) |  | 字符串 (String) |
| 6 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 7 | billmaketime | 制单时间 | billmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 8 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
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
| 19 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 20 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 21 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 22 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 29 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 30 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 31 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 32 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |