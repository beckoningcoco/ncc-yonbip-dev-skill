# |<<

**中建项目 (tb_project / nc.vo.tb.dimdocpub.ProjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5738.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | jtclgs | 具体承揽公司名称 | jtclgs | varchar(20) |  | 字符串 (String) |
| 5 | xmhte | 项目合同额 | xmhte | varchar(30) |  | 字符串 (String) |
| 6 | yjxmzsr | 预计项目总收入 | yjxmzsr | int |  | 整数 (Integer) |
| 7 | yjxmzcb | 预计项目总成本 | yjxmzcb | int |  | 整数 (Integer) |
| 8 | yjxmzlr | 预计项目总利润(亏损) | yjxmzlr | int |  | 整数 (Integer) |
| 9 | xmlrl | 项目利润率 | xmlrl | varchar(30) |  | 字符串 (String) |
| 10 | wfqybl | 我方权益比例 | wfqybl | varchar(30) |  | 字符串 (String) |
| 11 | kxsmj | 可销售面积 | kxsmj | varchar(30) |  | 字符串 (String) |
| 12 | yjkfztz | 预计开发总投资 | yjkfztz | varchar(30) |  | 字符串 (String) |
| 13 | xmwz | 项目位置 | xmwz | varchar(30) |  | 字符串 (String) |
| 14 | modifiedby | 最后修改人 | modifiedby | varchar(20) |  | 用户 (user) |
| 15 | createdtime | 创建时间 | createdtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | pk_org | 创建组织 | pk_org | varchar(20) |  | 组织 (org) |
| 17 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 18 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 19 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |