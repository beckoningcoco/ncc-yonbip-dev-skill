# |<<

**医疗服务基础分类 (bd_uh_srvcate / nc.vo.nhbd.pub2.SrvCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1133.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvcate | 分类主键 | pk_srvcate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | code | 分类编码 | code | varchar(50) |  | 字符串 (String) |
| 5 | name | 分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | pk_srvtype | 服务类型主键 | pk_srvtype | char(20) |  | 主键 (UFID) |
| 7 | dt_srvtype | 服务类型编码 | dt_srvtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_father | 上级分类 | pk_father | char(20) |  | 主键 (UFID) |
| 9 | mnecode | 内部码 | mnecode | varchar(50) |  | 字符串 (String) |
| 10 | flag_pd | 物品标志 | flag_pd | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_price | 定价模式 | pk_price | char(20) |  | 主键 (UFID) |
| 12 | pk_chcate_def | 默认病案分类 | pk_chcate_def | char(20) |  | 主键 (UFID) |
| 13 | note | 备注 | note | varchar(50) |  | 字符串 (String) |
| 14 | maketime | 制单时间 | maketime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | lastmaketime | 最后修改时间 | lastmaketime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 17 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 18 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 20 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |