# |<<

**企业会议情况统计 (scapto_meetingtotal / nc.vo.scapto.meetingtotal.MeetingTotalVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5162.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_meettotal | 企业会议情况统计 | pk_meettotal | char(20) | √ | 主键 (UFID) |
| 2 | company_name | 企业名称 | company_name | varchar(512) |  | 字符串 (String) |
| 3 | company_code | 企业编码 | company_code | varchar(64) |  | 字符串 (String) |
| 4 | meet_name | 会议名称 | meet_name | varchar(64) |  | 字符串 (String) |
| 5 | meet_type | 会议类型 | meet_type | varchar(50) |  | 字符串 (String) |
| 6 | meet_date | 会议日期 | meet_date | char(19) |  | 日期 (UFDate) |
| 7 | topic_total | 议题总数量 | topic_total | int |  | 整数 (Integer) |
| 8 | topic_pass | 通过议题数量 | topic_pass | int |  | 整数 (Integer) |
| 9 | topic_defer | 缓议议题数量 | topic_defer | int |  | 整数 (Integer) |
| 10 | topic_veto | 否决议题数量 | topic_veto | int |  | 整数 (Integer) |
| 11 | decidetopic_total | 重大决策议题数量 | decidetopic_total | int |  | 整数 (Integer) |
| 12 | decidetopic_pass | 重大决策-通过议题数量 | decidetopic_pass | int |  | 整数 (Integer) |
| 13 | decidetopic_defer | 重大决策-缓议议题数量 | decidetopic_defer | int |  | 整数 (Integer) |
| 14 | decidetopic_veto | 重大决策-否决议题数量 | decidetopic_veto | int |  | 整数 (Integer) |
| 15 | appointtopic_total | 重要人事任免议题数量 | appointtopic_total | int |  | 整数 (Integer) |
| 16 | appointtopic_pass | 重要人事任免-通过议题数量 | appointtopic_pass | int |  | 整数 (Integer) |
| 17 | appointtopic_defer | 重要人事任免-缓议议题数量 | appointtopic_defer | int |  | 整数 (Integer) |
| 18 | appointtopic_veto | 重要人事任免-否决议题数量 | appointtopic_veto | int |  | 整数 (Integer) |
| 19 | projecttopic_total | 重大项目安排议题数量 | projecttopic_total | int |  | 整数 (Integer) |
| 20 | projecttopic_pass | 重大项目安排-通过议题数量 | projecttopic_pass | int |  | 整数 (Integer) |
| 21 | projecttopic_defer | 重大项目安排-缓议议题数量 | projecttopic_defer | int |  | 整数 (Integer) |
| 22 | projecttopic_veto | 重大项目安排-否决议题数量 | projecttopic_veto | int |  | 整数 (Integer) |
| 23 | fundtopic_total | 大额资金运作议题数量 | fundtopic_total | int |  | 整数 (Integer) |
| 24 | fundtopic_pass | 大额资金运作-通过议题数量 | fundtopic_pass | int |  | 整数 (Integer) |
| 25 | fundtopic_defer | 大额资金运作-缓议议题数量 | fundtopic_defer | int |  | 整数 (Integer) |
| 26 | fundtopic_veto | 大额资金运作-否决议题数量 | fundtopic_veto | int |  | 整数 (Integer) |