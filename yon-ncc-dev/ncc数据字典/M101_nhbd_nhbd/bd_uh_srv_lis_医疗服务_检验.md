# |<<

**医疗服务_检验 (bd_uh_srv_lis / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvLisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1116.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvlis | 服务主键 | pk_srvlis | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 4 | dt_samptype | 标本类型 | dt_samptype | varchar(50) |  | 字符串 (String) |
| 5 | dt_colltype | 采集方法 | dt_colltype | varchar(50) |  | 字符串 (String) |
| 6 | dt_lisgroup | 检验分组 | dt_lisgroup | varchar(50) |  | 字符串 (String) |
| 7 | dt_contype | 试管类型 | dt_contype | varchar(50) |  | 字符串 (String) |
| 8 | note | 注意事项 | note | varchar(50) |  | 字符串 (String) |
| 9 | pk_srv | 医疗服务字典 | pk_srv | varchar(20) |  | 医疗服务字典 (uhsrv) |
| 10 | pk_samptype | 标本类型主键 | pk_samptype | varchar(20) |  | 字符串 (String) |
| 11 | pk_colltype | 采集方法主键 | pk_colltype | varchar(20) |  | 字符串 (String) |
| 12 | pk_contype | 试管类型主键 | pk_contype | varchar(20) |  | 字符串 (String) |
| 13 | pk_lisgroup | 检验分组主键 | pk_lisgroup | varchar(20) |  | 字符串 (String) |
| 14 | std_hi | 标准上限 | std_hi | decimal(14, 2) |  | 数值 (UFDouble) |
| 15 | std_lo | 标准下限 | std_lo | decimal(14, 2) |  | 数值 (UFDouble) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 19 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |