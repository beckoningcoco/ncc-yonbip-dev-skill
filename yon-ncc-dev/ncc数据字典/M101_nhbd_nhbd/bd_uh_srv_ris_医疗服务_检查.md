# |<<

**医疗服务_检查 (bd_uh_srv_ris / com.yonyou.nhis.bd.pub2.srv.vo.UhSrvRisVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1125.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvris | 服务主键 | pk_srvris | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 字符串 (String) |
| 4 | dt_ristype | 检查类型 | dt_ristype | varchar(50) |  | 字符串 (String) |
| 5 | dt_bodypart | 部位 | dt_bodypart | varchar(50) |  | 字符串 (String) |
| 6 | note | 注意事项 | note | varchar(200) |  | 字符串 (String) |
| 7 | pk_srv | 医疗服务字典 | pk_srv | varchar(20) |  | 医疗服务字典 (uhsrv) |
| 8 | flag_empty | 检查部位是否允许为空 | flag_empty | varchar(50) |  | 字符串 (String) |
| 9 | pk_ristype | 检查类型主键 | pk_ristype | varchar(20) |  | 检查类型(自定义档案) (Defdoc-030100) |
| 10 | pk_bodypart | 检查部位主键 | pk_bodypart | varchar(20) |  | 检查部位(自定义档案) (Defdoc-030101) |
| 11 | expert | 通用性 | expert | varchar(200) |  | 字符串 (String) |
| 12 | work | 作用 | work | varchar(200) |  | 字符串 (String) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | modifier | 修改人 | modifier | varchar(20) |  | 字符串 (String) |
| 16 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |