# |<<

**事项清单数据写入中间表 (scapto_matterlist_write / nc.vo.scapto.matterlistreport.write.MatterlistreportWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5151.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_listreportwrite | 事项清单数据写入中间表主键 | pk_listreportwrite | char(20) | √ | 主键 (UFID) |
| 2 | list_id | 事项清单标识 | list_id | varchar(50) | √ | 字符串 (String) |
| 3 | oper_type | 操作类型 | oper_type | varchar(50) |  | 字符串 (String) |
| 4 | org_type | 企业类型 | org_type | varchar(50) |  | 字符串 (String) |
| 5 | company_name | 企业名称 | company_name | varchar(50) | √ | 字符串 (String) |
| 6 | company_id | 企业编码 | company_id | varchar(50) | √ | 字符串 (String) |
| 7 | list_name | 事项清单名称 | list_name | varchar(50) |  | 字符串 (String) |
| 8 | list_version | 版本号 | list_version | varchar(50) |  | 字符串 (String) |
| 9 | effective_date | 生效日期 | effective_date | char(19) |  | 日期 (UFDate) |
| 10 | invalid_date | 失效日期 | invalid_date | char(19) |  | 日期 (UFDate) |
| 11 | remark | 备注 | remark | varchar(50) |  | 字符串 (String) |
| 12 | nc_ts | 最后修改时间 | nc_ts | char(19) |  | 日期时间 (UFDateTime) |
| 13 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 14 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 15 | return_code | 返回标识 | return_code | varchar(50) |  | 字符串 (String) |
| 16 | return_msg | 返回内容 | return_msg | varchar(50) |  | 字符串 (String) |
| 17 | pk_matterlistreport | 事项清单上报主键 | pk_matterlistreport | varchar(20) |  | 字符串 (String) |
| 18 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 19 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 20 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 21 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 22 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 23 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 24 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 25 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 26 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 27 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 28 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 29 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 30 | vreserve10 | 预留字段10 | vreserve10 | varchar(100) |  | 字符串 (String) |
| 31 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 32 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 33 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 34 | modifiedtime | 最后修改 时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |