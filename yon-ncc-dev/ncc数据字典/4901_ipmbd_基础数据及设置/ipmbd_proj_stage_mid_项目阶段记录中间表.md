# |<<

**项目阶段记录中间表 (ipmbd_proj_stage_mid / nc.vo.ipmbd.projstagemid.ProjStageMidVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3231.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_proj_stage_mid | 项目阶段中间表主键 | pk_proj_stage_mid | char(20) | √ | 主键 (UFID) |
| 2 | pk_bill | 单据主键 | pk_bill | char(20) |  | 主键 (UFID) |
| 3 | cbilltypecode | 单据类型 | cbilltypecode | varchar(50) |  | 字符串 (String) |
| 4 | vtrantypecode | 交易类型 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 5 | pk_before_stage | 前项目阶段 | pk_before_stage | char(20) |  | 主键 (UFID) |
| 6 | pk_after_stage | 后项目阶段 | pk_after_stage | char(20) |  | 主键 (UFID) |
| 7 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 8 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 9 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 10 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 11 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 12 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 13 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 14 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 15 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 16 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |