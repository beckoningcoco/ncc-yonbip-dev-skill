# |<<

**合同变更 (pm_contr_his / nc.vo.pcm.contract.ContrHistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4436.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contr_his | 合同变更主键 | pk_contr_his | char(20) | √ | 主键 (UFID) |
| 2 | contr_v | 合同版本号 | contr_v | int |  | 整数 (Integer) |
| 3 | pk_alt_per | 变更人 | pk_alt_per | varchar(20) |  | 用户 (user) |
| 4 | alt_date | 变更日期 | alt_date | char(19) |  | 日期 (UFDate) |
| 5 | alt_reason | 变更原因 | alt_reason | varchar(200) |  | 字符串 (String) |
| 6 | memo | 备注 | memo | varchar(300) |  | 字符串 (String) |
| 7 | src_pk | 变更来源 | src_pk | varchar(20) |  | 字符串 (String) |
| 8 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 9 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | bdef1 | 自定义项1 | bdef1 | varchar(101) |  | 自定义项 (Custom) |
| 12 | bdef2 | 自定义项2 | bdef2 | varchar(101) |  | 自定义项 (Custom) |
| 13 | bdef3 | 自定义项3 | bdef3 | varchar(101) |  | 自定义项 (Custom) |
| 14 | bdef4 | 自定义项4 | bdef4 | varchar(101) |  | 自定义项 (Custom) |
| 15 | bdef5 | 自定义项5 | bdef5 | varchar(101) |  | 自定义项 (Custom) |
| 16 | bdef6 | 自定义项6 | bdef6 | varchar(101) |  | 自定义项 (Custom) |
| 17 | bdef7 | 自定义项7 | bdef7 | varchar(101) |  | 自定义项 (Custom) |
| 18 | bdef8 | 自定义项8 | bdef8 | varchar(101) |  | 自定义项 (Custom) |
| 19 | bdef9 | 自定义项9 | bdef9 | varchar(101) |  | 自定义项 (Custom) |
| 20 | bdef10 | 自定义项10 | bdef10 | varchar(101) |  | 自定义项 (Custom) |
| 21 | bdef11 | 自定义项11 | bdef11 | varchar(101) |  | 自定义项 (Custom) |
| 22 | bdef12 | 自定义项12 | bdef12 | varchar(101) |  | 自定义项 (Custom) |
| 23 | bdef13 | 自定义项13 | bdef13 | varchar(101) |  | 自定义项 (Custom) |
| 24 | bdef14 | 自定义项14 | bdef14 | varchar(101) |  | 自定义项 (Custom) |
| 25 | bdef15 | 自定义项15 | bdef15 | varchar(101) |  | 自定义项 (Custom) |
| 26 | bdef16 | 自定义项16 | bdef16 | varchar(101) |  | 自定义项 (Custom) |
| 27 | bdef17 | 自定义项17 | bdef17 | varchar(101) |  | 自定义项 (Custom) |
| 28 | bdef18 | 自定义项18 | bdef18 | varchar(101) |  | 自定义项 (Custom) |
| 29 | bdef19 | 自定义项19 | bdef19 | varchar(101) |  | 自定义项 (Custom) |
| 30 | bdef20 | 自定义项20 | bdef20 | varchar(101) |  | 自定义项 (Custom) |