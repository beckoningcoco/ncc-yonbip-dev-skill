# |<<

**报表初始化主表 (fipub_reportinitialize / nc.vo.fipub.report.ReportInitializeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2271.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reportinitialize | 主表主键 | pk_reportinitialize | char(20) | √ | 主键 (UFID) |
| 2 | reporttype | 报表类型 | reporttype | varchar(50) |  | 字符串 (String) |
| 3 | reportformat | 账页格式 | reportformat | varchar(50) |  | 字符串 (String) |
| 4 | showformat | 显示格式 | showformat | varchar(50) |  | 字符串 (String) |
| 5 | rec_pay_direct | 收付方向 | rec_pay_direct | varchar(50) |  | 字符串 (String) |
| 6 | publishtype | 发布类型 | publishtype | varchar(50) |  | 字符串 (String) |
| 7 | isshowquickqrypane | 是否显示快速查询面板 | isshowquickqrypane | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isshowvoucher | 是否显示凭证号 | isshowvoucher | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | multiunitshowmode | 多组织显示方式 | multiunitshowmode | int |  | 整数 (Integer) |
| 10 | ownmodule | 所属模块 | ownmodule | varchar(50) |  | 字符串 (String) |
| 11 | node_code | 节点编码 | node_code | varchar(50) |  | 字符串 (String) |
| 12 | node_name | 节点名称 | node_name | varchar(50) |  | 字符串 (String) |
| 13 | pk_rep | 报表主键 | pk_rep | char(20) |  | 主键 (UFID) |
| 14 | pk_repdetail | 明细报表主键 | pk_repdetail | char(20) |  | 主键 (UFID) |
| 15 | pk_group | 集团主键 | pk_group | varchar(20) |  | 字符串 (String) |
| 16 | pk_org | 业务单元主键 | pk_org | varchar(20) |  | 字符串 (String) |
| 17 | pk_dept | 部门主键 | pk_dept | varchar(20) |  | 字符串 (String) |
| 18 | createtable | 是否创建物理表 | createtable | int |  | 整数 (Integer) |
| 19 | isweb | 是否轻量化 | isweb | char(1) |  | 布尔类型 (UFBoolean) |
| 20 | creator | 创建者 | creator | varchar(20) |  | 字符串 (String) |