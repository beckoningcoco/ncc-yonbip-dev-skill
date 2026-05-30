# |<<

**企业信息数据写入中间表 (scapto_enterprise_write / nc.vo.scapto.enterprise.write.EnterpriseWriteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5127.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_enterprise_write | 企业信息数据写入中间表主键 | pk_enterprise_write | char(20) | √ | 主键 (UFID) |
| 2 | company_pk | 企业标识 | company_pk | varchar(50) | √ | 字符串 (String) |
| 3 | company_name | 企业名称 | company_name | varchar(50) | √ | 字符串 (String) |
| 4 | company_id | 企业编码 | company_id | varchar(50) | √ | 字符串 (String) |
| 5 | vdomestic | 境内境外标志 | vdomestic | varchar(100) |  | 字符串 (String) |
| 6 | vunittype | 单位类型 | vunittype | varchar(100) |  | 字符串 (String) |
| 7 | vshelltype | 空壳格式类型 | vshelltype | varchar(100) |  | 字符串 (String) |
| 8 | voperatestate | 运营状态 | voperatestate | varchar(100) |  | 字符串 (String) |
| 9 | bisplatformcompany | 是否平台公司 | bisplatformcompany | varchar(50) |  | 字符串 (String) |
| 10 | bisshellcompany | 是否壳公司 | bisshellcompany | varchar(50) |  | 字符串 (String) |
| 11 | remark | 备注 | remark | varchar(512) |  | 备注 (Memo) |
| 12 | oper_type | 操作类型 | oper_type | varchar(50) |  | 字符串 (String) |
| 13 | nc_ts | 最后修改时间 | nc_ts | char(19) |  | 日期时间 (UFDateTime) |
| 14 | upload_time | 上传时间 | upload_time | char(19) |  | 日期时间 (UFDateTime) |
| 15 | upload_flag | 上传标识 | upload_flag | varchar(50) |  | 字符串 (String) |
| 16 | return_code | 返回标识 | return_code | varchar(50) |  | 字符串 (String) |
| 17 | return_msg | 返回内容 | return_msg | varchar(50) |  | 字符串 (String) |
| 18 | pk_enterprise | 企业信息管理主键 | pk_enterprise | varchar(20) |  | 字符串 (String) |
| 19 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 20 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 21 | pk_org_v | 业务单元版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 22 | vreserve1 | 预留字段1 | vreserve1 | varchar(100) |  | 字符串 (String) |
| 23 | vreserve2 | 预留字段2 | vreserve2 | varchar(100) |  | 字符串 (String) |
| 24 | vreserve3 | 预留字段3 | vreserve3 | varchar(100) |  | 字符串 (String) |
| 25 | vreserve4 | 预留字段4 | vreserve4 | varchar(100) |  | 字符串 (String) |
| 26 | vreserve5 | 预留字段5 | vreserve5 | varchar(100) |  | 字符串 (String) |
| 27 | vreserve6 | 预留字段6 | vreserve6 | varchar(100) |  | 字符串 (String) |
| 28 | vreserve7 | 预留字段7 | vreserve7 | varchar(100) |  | 字符串 (String) |
| 29 | vreserve8 | 预留字段8 | vreserve8 | varchar(100) |  | 字符串 (String) |
| 30 | vreserve9 | 预留字段9 | vreserve9 | varchar(100) |  | 字符串 (String) |
| 31 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 32 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 33 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 34 | modifiedtime | 最后修改 时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |