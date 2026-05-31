# |<<

**汇总关联 (fip_sumrelation / nc.vo.fip.sumrelation.SumRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2251.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sumrelation | 对象标识 | pk_sumrelation | char(20) | √ | 主键 (UFID) |
| 2 | src_group | 来源集团 | src_group | varchar(20) |  | 组织_集团 (group) |
| 3 | src_org | 来源组织 | src_org | varchar(20) |  | 组织 (org) |
| 4 | src_system | 来源系统 | src_system | varchar(50) |  | 字符串 (String) |
| 5 | src_billtype | 来源单据类型 | src_billtype | varchar(20) |  | 字符串 (String) |
| 6 | src_relationid | 来源单据关联号 | src_relationid | varchar(50) |  | 字符串 (String) |
| 7 | src_operator | 来源用户 | src_operator | varchar(20) |  | 用户 (user) |
| 8 | src_busidate | 来源业务日期 | src_busidate | char(19) |  | 日期 (UFDate) |
| 9 | src_defdoc1 | 来源自定义档案1 | src_defdoc1 | varchar(101) |  | 字符串 (String) |
| 10 | src_defdoc2 | 来源自定义档案2 | src_defdoc2 | varchar(101) |  | 字符串 (String) |
| 11 | src_defdoc3 | 来源自定义档案3 | src_defdoc3 | varchar(101) |  | 字符串 (String) |
| 12 | des_group | 目标集团 | des_group | varchar(20) |  | 组织_集团 (group) |
| 13 | des_org | 目标组织 | des_org | varchar(20) |  | 组织 (org) |
| 14 | des_system | 目标系统 | des_system | varchar(50) |  | 字符串 (String) |
| 15 | des_billtype | 目标单据类型 | des_billtype | varchar(20) |  | 字符串 (String) |
| 16 | des_relationid | 目标单据关联号 | des_relationid | varchar(50) |  | 字符串 (String) |
| 17 | des_operator | 目标用户 | des_operator | varchar(20) |  | 用户 (user) |
| 18 | des_busidate | 目标业务日期 | des_busidate | char(19) |  | 日期 (UFDate) |
| 19 | des_defdoc1 | 目标自定义档案1 | des_defdoc1 | varchar(101) |  | 字符串 (String) |
| 20 | des_defdoc2 | 目标自定义档案2 | des_defdoc2 | varchar(101) |  | 字符串 (String) |
| 21 | des_defdoc3 | 目标自定义档案3 | des_defdoc3 | varchar(101) |  | 字符串 (String) |
| 22 | groupid | 分组信息 | groupid | varchar(50) |  | 字符串 (String) |
| 23 | src_freedef1 | 来源自定义项目1 | src_freedef1 | varchar(200) |  | 字符串 (String) |
| 24 | src_freedef2 | 来源自定义项目2 | src_freedef2 | varchar(200) |  | 字符串 (String) |
| 25 | src_freedef3 | 来源自定义项目3 | src_freedef3 | varchar(200) |  | 字符串 (String) |
| 26 | src_freedef4 | 来源自定义项目4 | src_freedef4 | varchar(200) |  | 字符串 (String) |
| 27 | src_freedef5 | 来源自定义项目5 | src_freedef5 | varchar(200) |  | 字符串 (String) |
| 28 | des_freedef1 | 目标自定义项目1 | des_freedef1 | varchar(200) |  | 字符串 (String) |
| 29 | des_freedef2 | 目标自定义项目2 | des_freedef2 | varchar(200) |  | 字符串 (String) |
| 30 | des_freedef3 | 目标自定义项目3 | des_freedef3 | varchar(200) |  | 字符串 (String) |
| 31 | des_freedef4 | 目标自定义项目4 | des_freedef4 | varchar(200) |  | 字符串 (String) |
| 32 | des_freedef5 | 目标自定义项目5 | des_freedef5 | varchar(200) |  | 字符串 (String) |