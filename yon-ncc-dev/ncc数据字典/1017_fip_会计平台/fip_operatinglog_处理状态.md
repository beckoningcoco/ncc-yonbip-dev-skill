# |<<

**处理状态 (fip_operatinglog / nc.vo.fip.operatinglogs.OperatingLogVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2243.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_operatinglog | 对象标识 | pk_operatinglog | char(20) | √ | 主键 (UFID) |
| 2 | src_group | 来源集团 | src_group | varchar(20) |  | 组织_集团 (group) |
| 3 | src_org | 来源组织 | src_org | varchar(20) |  | 组织 (org) |
| 4 | src_system | 来源系统 | src_system | varchar(50) |  | 字符串 (String) |
| 5 | src_billtype | 来源单据类型 | src_billtype | varchar(20) |  | 字符串 (String) |
| 6 | src_relationid | 来源关联号 | src_relationid | varchar(50) |  | 字符串 (String) |
| 7 | src_operator | 来源用户 | src_operator | varchar(20) |  | 用户 (user) |
| 8 | src_busidate | 来源业务日期 | src_busidate | char(19) |  | 日期 (UFDate) |
| 9 | des_group | 目标集团 | des_group | varchar(20) |  | 组织_集团 (group) |
| 10 | des_org | 目标组织 | des_org | varchar(20) |  | 组织 (org) |
| 11 | des_system | 目标系统 | des_system | varchar(50) |  | 字符串 (String) |
| 12 | des_billtype | 目标单据类型 | des_billtype | varchar(20) |  | 字符串 (String) |
| 13 | des_relationid | 目标单据关联号 | des_relationid | varchar(50) |  | 字符串 (String) |
| 14 | des_operator | 目标用户 | des_operator | varchar(20) |  | 用户 (user) |
| 15 | des_busidate | 目标业务日期 | des_busidate | char(19) |  | 日期 (UFDate) |
| 16 | operateflag | 处理状态 | operateflag | int |  | 处理状态标志 (operatingstate) |  | 0=刚进入平台，尚未生成目标单据; |