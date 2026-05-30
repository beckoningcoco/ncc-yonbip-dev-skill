# |<<

**组织信息上报中间表 (scapso_middletable / nc.vo.scapso.middletable.MiddleTableVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5106.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_middletable | 主键 | pk_middletable | char(20) | √ | 主键 (UFID) |
| 2 | code | code | code | varchar(50) |  | 字符串 (String) |
| 3 | name | name | name | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 字符串 (String) |
| 5 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 6 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 8 | f_10001 | 省属企业组织机构代码 | f_10001 | varchar(23) |  | 字符串 (String) |
| 9 | f_10002 | 单位名称 | f_10002 | varchar(512) |  | 字符串 (String) |
| 10 | f_10003 | 中文简称 | f_10003 | varchar(64) |  | 字符串 (String) |
| 11 | f_10004 | 英文全称 | f_10004 | varchar(512) |  | 字符串 (String) |
| 12 | f_10005 | 英文简称 | f_10005 | varchar(64) |  | 字符串 (String) |
| 13 | f_10006 | 境内境外标志 | f_10006 | varchar(20) |  | 字符串 (String) |
| 14 | f_10007 | 组织形式代码 | f_10007 | varchar(32) |  | 字符串 (String) |
| 15 | f_10008 | 统一社会信用代码 | f_10008 | varchar(18) |  | 字符串 (String) |
| 16 | f_10009 | 成立日期 | f_10009 | varchar(10) |  | 字符串 (String) |
| 17 | f_10010 | 所属大洲 | f_10010 | varchar(64) |  | 字符串 (String) |
| 18 | f_10011 | 所属国家和地区代码 | f_10011 | varchar(20) |  | 字符串 (String) |
| 19 | f_10012 | 所在区域代码 | f_10012 | varchar(20) |  | 字符串 (String) |
| 20 | f_10013 | 注册地址 | f_10013 | varchar(1024) |  | 字符串 (String) |
| 21 | f_10014 | 经营范围 | f_10014 | varchar(1024) |  | 字符串 (String) |
| 22 | f_10015 | 单位类型 | f_10015 | varchar(20) |  | 字符串 (String) |
| 23 | f_10016 | 所属行业代码 | f_10016 | varchar(512) |  | 字符串 (String) |
| 24 | f_10017 | 经营规模 | f_10017 | varchar(64) |  | 字符串 (String) |
| 25 | f_10018 | 空壳格式类别 | f_10018 | varchar(64) |  | 字符串 (String) |
| 26 | f_10019 | 经营状态 | f_10019 | varchar(64) |  | 字符串 (String) |
| 27 | f_10020 | 经营期限自 | f_10020 | varchar(10) |  | 字符串 (String) |
| 28 | f_10021 | 经营期限至 | f_10021 | varchar(10) |  | 字符串 (String) |
| 29 | f_10022 | 是否平台公司标志 | f_10022 | varchar(8) |  | 字符串 (String) |
| 30 | f_10023 | 是否纳入决算标志 | f_10023 | varchar(8) |  | 字符串 (String) |
| 31 | f_10024 | 是否上市 | f_10024 | varchar(8) |  | 字符串 (String) |
| 32 | f_10025 | 官网 | f_10025 | varchar(512) |  | 字符串 (String) |
| 33 | f_10026 | 上级管理单位代码 | f_10026 | varchar(1024) |  | 字符串 (String) |
| 34 | f_10027 | 法定代表人 | f_10027 | varchar(512) |  | 字符串 (String) |
| 35 | f_10028 | 法定代表人联系电话 | f_10028 | varchar(64) |  | 字符串 (String) |
| 36 | f_10029 | 企业人数 | f_10029 | int |  | 整数 (Integer) |
| 37 | f_10030 | 企业联系人 | f_10030 | varchar(64) |  | 字符串 (String) |
| 38 | f_10031 | 企业联系人电话 | f_10031 | varchar(64) |  | 字符串 (String) |
| 39 | f_10032 | 邮箱 | f_10032 | varchar(512) |  | 字符串 (String) |
| 40 | f_10033 | 创建时间 | f_10033 | varchar(19) |  | 字符串 (String) |
| 41 | f_10034 | 版本号 | f_10034 | varchar(18) |  | 字符串 (String) |
| 42 | f_10035 | 变更时间 | f_10035 | varchar(19) |  | 字符串 (String) |
| 43 | f_10036 | 编码启用状态 | f_10036 | varchar(18) |  | 字符串 (String) |
| 44 | f_10037 | 新增类型 | f_10037 | varchar(512) |  | 字符串 (String) |
| 45 | f_10038 | 注销类型 | f_10038 | varchar(512) |  | 字符串 (String) |
| 46 | f_10039 | 备注 | f_10039 | varchar(1024) |  | 字符串 (String) |
| 47 | f_10040 | 注册资本 | f_10040 | decimal(18, 5) |  | 数值 (UFDouble) |
| 48 | f_10041 | 币种代码 | f_10041 | varchar(8) |  | 字符串 (String) |
| 49 | f_10042 | 企业类型 | f_10042 | varchar(64) |  | 字符串 (String) |
| 50 | f_10043 | 所属集团名称 | f_10043 | varchar(1024) |  | 字符串 (String) |
| 51 | f_10044 | 管理层级 | f_10044 | int |  | 整数 (Integer) |
| 52 | f_10045 | 主要省属企业出资单位名称 | f_10045 | varchar(1024) |  | 字符串 (String) |
| 53 | f_10046 | 主要省属企业出资单位控股比例 | f_10046 | decimal(18, 2) |  | 数值 (UFDouble) |
| 54 | f_10047 | 企业产权级次 | f_10047 | int |  | 整数 (Integer) |
| 55 | upload_time | 上传时间 | upload_time | varchar(19) |  | 字符串 (String) |
| 56 | upload_falg | 上传标识 | upload_falg | varchar(2) |  | 字符串 (String) |
| 57 | return_code | 返回标识 | return_code | varchar(10) |  | 字符串 (String) |
| 58 | return_msg | 返回内容 | return_msg | varchar(254) |  | 字符串 (String) |
| 59 | def1 | 自定义项1 | def1 | varchar(100) |  | 字符串 (String) |
| 60 | def2 | 自定义项2 | def2 | varchar(100) |  | 字符串 (String) |
| 61 | def3 | 自定义项3 | def3 | varchar(100) |  | 字符串 (String) |
| 62 | def4 | 自定义项4 | def4 | varchar(100) |  | 字符串 (String) |
| 63 | def5 | 自定义项5 | def5 | varchar(100) |  | 字符串 (String) |
| 64 | def6 | 自定义项6 | def6 | varchar(100) |  | 字符串 (String) |
| 65 | def7 | 自定义项7 | def7 | varchar(100) |  | 字符串 (String) |
| 66 | def8 | 自定义项8 | def8 | varchar(100) |  | 字符串 (String) |
| 67 | def9 | 自定义项9 | def9 | varchar(100) |  | 字符串 (String) |
| 68 | def10 | 自定义项10 | def10 | varchar(100) |  | 字符串 (String) |
| 69 | def11 | 自定义项11 | def11 | varchar(100) |  | 字符串 (String) |
| 70 | def12 | 自定义项12 | def12 | varchar(100) |  | 字符串 (String) |
| 71 | def13 | 自定义项13 | def13 | varchar(100) |  | 字符串 (String) |
| 72 | def14 | 自定义项14 | def14 | varchar(100) |  | 字符串 (String) |
| 73 | def15 | 自定义项15 | def15 | varchar(100) |  | 字符串 (String) |
| 74 | def16 | 自定义项16 | def16 | varchar(100) |  | 字符串 (String) |
| 75 | def17 | 自定义项17 | def17 | varchar(100) |  | 字符串 (String) |
| 76 | def18 | 自定义项18 | def18 | varchar(100) |  | 字符串 (String) |
| 77 | def19 | 自定义项19 | def19 | varchar(100) |  | 字符串 (String) |
| 78 | def20 | 自定义项20 | def20 | varchar(100) |  | 字符串 (String) |