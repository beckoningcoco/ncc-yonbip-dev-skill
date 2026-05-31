# |<<

**用法与材料费用关系 (bd_uh_usage_srv / com.yonyou.yh.nhis.bd.usagesrv.vo.UsageSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1139.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_usagesrv | 主键 | pk_usagesrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_usage | 用法主键 | pk_usage | varchar(50) |  | 字符串 (String) |
| 5 | pk_srv | 服务项目 | pk_srv | varchar(50) |  | 字符串 (String) |
| 6 | quan | 数量 | quan | decimal(14, 2) |  | 数值 (UFDouble) |
| 7 | dt_usage | 用法编码 | dt_usage | varchar(50) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |