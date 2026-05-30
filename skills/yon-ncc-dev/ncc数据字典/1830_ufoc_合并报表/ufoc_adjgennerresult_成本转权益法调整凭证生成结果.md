# |<<

**成本转权益法调整凭证生成结果 (ufoc_adjgennerresult / nc.vo.ufoc.adjgennerresult.AdjgennerResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5857.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjresult | 主键 | pk_adjresult | char(20) | √ | 主键 (UFID) |
| 2 | pk_adjascheme | 调整方案 | pk_adjascheme | varchar(20) |  | 报表调整方案 (adjscheme) |
| 3 | investor | 投资方 | investor | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 4 | investee | 被投资方 | investee | varchar(20) |  | 组织_业务单元_报表组织 (reportorg) |
| 5 | pk_template | 调整模板 | pk_template | varchar(20) |  | 调整及抵销模板 (dxrelation) |
| 6 | ishasvouch | 是否有调整凭证生成 | ishasvouch | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_vouch | 凭证 | pk_vouch | varchar(20) |  | 凭证头 (iufoVouchHead) |
| 8 | pk_hbscheme | 合并方案 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 9 | alone_id | alone_id | alone_id | varchar(32) |  | 字符串 (String) |
| 10 | pk_keygroup | 关键字组合 | pk_keygroup | varchar(20) |  | 关键字组合 (关键字组合) |
| 11 | dataorigin | 数据来源 | dataorigin | varchar(50) |  | 字符串 (String) |